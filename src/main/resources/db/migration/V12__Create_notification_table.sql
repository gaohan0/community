create table notification
(
	id BIGINT  AUTO_INCREMENT PRIMARY KEY,
	notifier BIGINT not null,
	receiver BIGINT not null,
	outerId BIGINT not null,
	type int not null,
	gmt_create int not null,
	status int default 0 not null
);
