USE wehanju;

-- employee table insert
INSERT INTO employee(employee_id, employee_name, employee_passwd, employee_addr, employee_email, employee_phone, employee_hiredate)
VALUES(371229, "������", "950116", "�λ�� ���ϱ�", "parkhanju95@gmail.com", "010-4116-9516", now());
INSERT INTO employee(employee_id, employee_name, employee_passwd, employee_addr, employee_email, employee_phone, employee_hiredate)
VALUES(371230, "������", "970829", "�λ�� ������", "yeyeongkwak@gmail.com", "010-9436-0575", now());
INSERT INTO employee(employee_id, employee_name, employee_passwd, employee_addr, employee_email, employee_phone, employee_hiredate)
VALUES(371231, "��α�", "950714", "�λ�� ����", "gyu0714@gmail.com", "010-1111-1111", now());

COMMIT;

SELECT * FROM employee;