create table menu_item
(
    menu_item_id bigint       not null
        primary key,
    name         varchar(255) null,
    price        double       not null,
    size         double       not null,
    summary      varchar(255) null,
    order_id     bigint       null
);

create table user
(
    user_id    bigint       not null
        primary key,
    email      varchar(255) null,
    first_name varchar(255) null,
    last_name  varchar(255) null,
    mobile     varchar(255) null,
    password   varchar(255) null,
    role       smallint     null
);

create table `order`
(
    order_id     bigint   not null
        primary key,
    price        double   not null,
    status       smallint null,
    menu_item_id bigint   null,
    user_id      bigint   null,
    constraint FK1tcl3hlx58yqfu2a3ffmj1qt2
        foreign key (menu_item_id) references menu_item (menu_item_id),
    constraint FKcpl0mjoeqhxvgeeeq5piwpd3i
        foreign key (user_id) references user (user_id)
);

alter table menu_item
    add constraint FKnr1038p1h6s50o8t9aci1ighb
        foreign key (order_id) references `order` (order_id);
