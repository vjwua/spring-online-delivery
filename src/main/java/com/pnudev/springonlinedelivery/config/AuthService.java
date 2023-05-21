package com.pnudev.springonlinedelivery.config;

import com.pnudev.springonlinedelivery.dto.AuthResponseDto;
import com.pnudev.springonlinedelivery.dto.AuthenticationRequest;
import com.pnudev.springonlinedelivery.dto.RegisterRequest;
import com.pnudev.springonlinedelivery.models.Role;
import com.pnudev.springonlinedelivery.models.Token;
import com.pnudev.springonlinedelivery.models.User;
import com.pnudev.springonlinedelivery.repos.TokenRepository;
import com.pnudev.springonlinedelivery.repos.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    private final TokenRepository tokenRepository;
    public AuthResponseDto register(RegisterRequest registerRequest) {
        //List<User> users = userRepository.findAll();
        //long id = users.get(users.size()-1).getId() + 1;
        long id = 1;
        var user = User.builder()
                .id(id)
                .firstName(registerRequest.getFirstName())
                .lastName(registerRequest.getLastName())
                .email(registerRequest.getEmail())
                .password(passwordEncoder.encode(registerRequest.getPassword()))
                .mobile(registerRequest.getMobile())
                .active(true)
                .role(Role.USER)
                .build();
        userRepository.save(user);
        var jwtToken = jwtService.generateToken(user);
        saveUserToken(user, jwtToken);
        return AuthResponseDto.builder()
                .jwt(jwtToken).build();
    }

    public AuthResponseDto authenticate(AuthenticationRequest authenticationRequest) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        authenticationRequest.getEmail(),
                        authenticationRequest.getPassword()));
        var user = userRepository.findByEmail(authenticationRequest.getEmail()).orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        revokeAllUserTokens(user);
        saveUserToken(user, jwtToken);
        return AuthResponseDto.builder()
                .jwt(jwtToken).build();
    }

    private void saveUserToken(User user, String jwtToken) {
        List<Token> tokens = tokenRepository.findAll();
        //int id = tokens.get(tokens.size()-1).getTokenId()+1 ;
        int id=1;
        var token = Token
                .builder()
                .tokenId(id)
                .value(jwtToken)
                .user(user)
                .build();
        tokenRepository.save(token);
    }


    private void revokeAllUserTokens(User user) {
        var tokens = tokenRepository.findByUser(user);
        List<Token> validUserTokens = new ArrayList<>();
        for(Token token: tokens){
            if (!token.expired && !token.revoked){
                validUserTokens.add(token);
            }
        }
        if (validUserTokens.isEmpty())
            return;
        validUserTokens.forEach(token -> {
            token.setExpired(true);
            token.setRevoked(true);
        });
        tokenRepository.saveAll(validUserTokens);
    }
}
