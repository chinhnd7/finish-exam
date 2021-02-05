INSERT INTO user(id, name, email, password) VALUES
 (1, 'Jun', 'JK@gmail.com', '123456'),
 (2, 'Nguyen', 'Nolove@gmail.com', '123456'),
 (3, 'Tam', 'tam@gmail.com', '123456'),
 (4, 'Hoang', 'hoang@gmail.com', '123456');

INSERT INTO teacher(phone, experiences, id) VALUES
 ('0999999888', 10, 1),
 ('0383555444', 20, 2);

 INSERT INTO student(year, id) VALUES
  (3, 3),
  (4, 4);

INSERT INTO course(name, description, location, opened, teacher_id) VALUES
 ('WPYTHON', 'Training SQL', 'HN','20200303',1),
 ('PYTHON', 'Training Python', 'HCM','20210303',2);