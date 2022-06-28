USE wehanju;

-- employee table insert
INSERT INTO employee(employee_id, employee_name, employee_passwd, employee_addr, employee_email, employee_phone, employee_hiredate)
VALUES(371229, "박한주", "950116", "부산시 사하구", "parkhanju95@gmail.com", "010-4116-9516", now());
INSERT INTO employee(employee_id, employee_name, employee_passwd, employee_addr, employee_email, employee_phone, employee_hiredate)
VALUES(371230, "곽예영", "970829", "부산시 동래구", "yeyeongkwak@gmail.com", "010-9436-0575", now());
INSERT INTO employee(employee_id, employee_name, employee_passwd, employee_addr, employee_email, employee_phone, employee_hiredate)
VALUES(371231, "김민규", "950714", "부산시 남구", "gyu0714@gmail.com", "010-3777-3472", now());

COMMIT;

SELECT * FROM employee;
