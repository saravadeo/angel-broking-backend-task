CREATE TABLE `card` (
  `uuid` varchar(255) NOT NULL,
  `created` datetime(6) NOT NULL,
  `updated` datetime(6) NOT NULL,
  `bank_name` varchar(255) DEFAULT NULL,
  `credit_limit` decimal(19,2) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user` (
  `uuid` varchar(255) NOT NULL,
  `created` datetime(6) NOT NULL,
  `updated` datetime(6) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `card_uuid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  KEY `FK7gxinqyjx9bp9nmm6nsf5l07y` (`card_uuid`),
  CONSTRAINT `FK7gxinqyjx9bp9nmm6nsf5l07y` FOREIGN KEY (`card_uuid`) REFERENCES `card` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `transaction` (
  `uuid` varchar(255) NOT NULL,
  `created` datetime(6) NOT NULL,
  `updated` datetime(6) NOT NULL,
  `amount` decimal(19,2) DEFAULT NULL,
  `spend_type` varchar(255) DEFAULT NULL,
  `user_uuid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  KEY `FKm8xhrmurs1v398n9148j2xh30` (`user_uuid`),
  CONSTRAINT `FKm8xhrmurs1v398n9148j2xh30` FOREIGN KEY (`user_uuid`) REFERENCES `user` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into card values('1baecd2e-1956-11e9-8f89-7845c4abc6a2', now(), now(), 'Angel', 100000, 'CREDIT');

insert into user values('4580dc8c-1956-11e9-8f89-7845c4abc6a2', now(), now(), 'user1', '1baecd2e-1956-11e9-8f89-7845c4abc6a2');
insert into user values('47cd3d99-1956-11e9-8f89-7845c4abc6a2', now(), now(), 'user2', '1baecd2e-1956-11e9-8f89-7845c4abc6a2');
insert into user values('4a012be7-1956-11e9-8f89-7845c4abc6a2', now(), now(), 'user3', '1baecd2e-1956-11e9-8f89-7845c4abc6a2');
insert into user values('4bfc110c-1956-11e9-8f89-7845c4abc6a2', now(), now(), 'user4', '1baecd2e-1956-11e9-8f89-7845c4abc6a2');

 insert into transaction values(uuid(), '2018-10-10 11:49:26.000000', '2018-10-10 11:49:26.000000', 10000, 'SHOPPING', '4580dc8c-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-10-17 11:49:26.000000', '2018-10-17 11:49:26.000000', 20000, 'OTHER', '4580dc8c-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-10-25 11:49:26.000000', '2018-10-25 11:49:26.000000', 5000, 'MEDICINE', '4580dc8c-1956-11e9-8f89-7845c4abc6a2');
insert into transaction values(uuid(), '2018-11-10 11:49:26.000000', '2018-11-10 11:49:26.000000', 20000, 'SHOPPING', '4580dc8c-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-11-17 11:49:26.000000', '2018-11-17 11:49:26.000000', 15000, 'OTHER', '4580dc8c-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-11-25 11:49:26.000000', '2018-11-25 11:49:26.000000', 10000, 'MEDICINE', '4580dc8c-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-12-10 11:49:26.000000', '2018-12-10 11:49:26.000000', 25000, 'SHOPPING', '4580dc8c-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-12-17 11:49:26.000000', '2018-12-17 11:49:26.000000', 10000, 'OTHER', '4580dc8c-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-12-25 11:49:26.000000', '2018-12-25 11:49:26.000000', 7000, 'MEDICINE', '4580dc8c-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2019-01-10 11:49:26.000000', '2019-01-10 11:49:26.000000', 30000, 'SHOPPING', '4580dc8c-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2019-01-12 11:49:26.000000', '2019-01-12 11:49:26.000000', 20000, 'OTHER', '4580dc8c-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2019-01-15 11:49:26.000000', '2019-01-15 11:49:26.000000', 15000, 'MEDICINE', '4580dc8c-1956-11e9-8f89-7845c4abc6a2');

 insert into transaction values(uuid(), '2018-10-10 11:49:26.000000', '2018-10-10 11:49:26.000000', 8000, 'SHOPPING', '47cd3d99-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-10-17 11:49:26.000000', '2018-10-17 11:49:26.000000', 20000, 'OTHER', '47cd3d99-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-10-25 11:49:26.000000', '2018-10-25 11:49:26.000000', 7000, 'MEDICINE', '47cd3d99-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-11-10 11:49:26.000000', '2018-11-10 11:49:26.000000', 25000, 'SHOPPING', '47cd3d99-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-11-17 11:49:26.000000', '2018-11-17 11:49:26.000000', 5000, 'OTHER', '47cd3d99-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-11-25 11:49:26.000000', '2018-11-25 11:49:26.000000', 50000, 'MEDICINE', '47cd3d99-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-12-10 11:49:26.000000', '2018-12-10 11:49:26.000000', 20000, 'SHOPPING', '47cd3d99-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-12-17 11:49:26.000000', '2018-12-17 11:49:26.000000', 5000, 'OTHER', '47cd3d99-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-12-25 11:49:26.000000', '2018-12-25 11:49:26.000000', 7000, 'MEDICINE', '47cd3d99-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2019-01-10 11:49:26.000000', '2019-01-10 11:49:26.000000', 20000, 'SHOPPING', '47cd3d99-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2019-01-12 11:49:26.000000', '2019-01-12 11:49:26.000000', 10000, 'OTHER', '47cd3d99-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2019-01-15 11:49:26.000000', '2019-01-15 11:49:26.000000', 15000, 'MEDICINE', '47cd3d99-1956-11e9-8f89-7845c4abc6a2');


 insert into transaction values(uuid(), '2018-10-10 11:49:26.000000', '2018-10-10 11:49:26.000000', 10000, 'SHOPPING', '4a012be7-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-10-17 11:49:26.000000', '2018-10-17 11:49:26.000000', 1000, 'OTHER', '4a012be7-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-10-25 11:49:26.000000', '2018-10-25 11:49:26.000000', 5000, 'MEDICINE', '4a012be7-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-11-10 11:49:26.000000', '2018-11-10 11:49:26.000000', 20000, 'SHOPPING', '4a012be7-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-11-17 11:49:26.000000', '2018-11-17 11:49:26.000000', 8000, 'OTHER', '4a012be7-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-11-25 11:49:26.000000', '2018-11-25 11:49:26.000000', 5000, 'MEDICINE', '4a012be7-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-12-10 11:49:26.000000', '2018-12-10 11:49:26.000000', 25000, 'SHOPPING', '4a012be7-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-12-17 11:49:26.000000', '2018-12-17 11:49:26.000000', 15000, 'OTHER', '4a012be7-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-12-25 11:49:26.000000', '2018-12-25 11:49:26.000000', 17000, 'MEDICINE', '4a012be7-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2019-01-10 11:49:26.000000', '2019-01-10 11:49:26.000000', 10000, 'SHOPPING', '4a012be7-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2019-01-12 11:49:26.000000', '2019-01-12 11:49:26.000000', 5000, 'OTHER', '4a012be7-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2019-01-15 11:49:26.000000', '2019-01-15 11:49:26.000000', 15000, 'MEDICINE', '4a012be7-1956-11e9-8f89-7845c4abc6a2');


 insert into transaction values(uuid(), '2018-10-10 11:49:26.000000', '2018-10-10 11:49:26.000000', 15000, 'SHOPPING', '4bfc110c-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-10-17 11:49:26.000000', '2018-10-17 11:49:26.000000', 10000, 'OTHER', '4bfc110c-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-10-25 11:49:26.000000', '2018-10-25 11:49:26.000000', 25000, 'MEDICINE', '4bfc110c-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-11-10 11:49:26.000000', '2018-11-10 11:49:26.000000', 25000, 'SHOPPING', '4bfc110c-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-11-17 11:49:26.000000', '2018-11-17 11:49:26.000000', 18000, 'OTHER', '4bfc110c-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-11-25 11:49:26.000000', '2018-11-25 11:49:26.000000', 15000, 'MEDICINE', '4bfc110c-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-12-10 11:49:26.000000', '2018-12-10 11:49:26.000000', 20000, 'SHOPPING', '4bfc110c-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-12-17 11:49:26.000000', '2018-12-17 11:49:26.000000', 10000, 'OTHER', '4bfc110c-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2018-12-25 11:49:26.000000', '2018-12-25 11:49:26.000000', 7000, 'MEDICINE', '4bfc110c-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2019-01-10 11:49:26.000000', '2019-01-10 11:49:26.000000', 20000, 'SHOPPING', '4bfc110c-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2019-01-12 11:49:26.000000', '2019-01-12 11:49:26.000000', 8000, 'OTHER', '4bfc110c-1956-11e9-8f89-7845c4abc6a2');
 insert into transaction values(uuid(), '2019-01-15 11:49:26.000000', '2019-01-15 11:49:26.000000', 20000, 'MEDICINE', '4bfc110c-1956-11e9-8f89-7845c4abc6a2');
