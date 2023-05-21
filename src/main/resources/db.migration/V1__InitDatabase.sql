create table menu_items
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
    constraint FK_order_menu_item
        foreign key (menu_item_id) references menu_items (menu_item_id),
    constraint FK_order_user
        foreign key (user_id) references user (user_id)
);

alter table menu_items
    add constraint FK_menu_item_order
        foreign key (order_id) references `order` (order_id);
