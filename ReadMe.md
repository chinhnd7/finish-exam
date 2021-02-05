# Nguyễn Đức Chính
## Khoá học Clean Code - Luvina 2020


## Phần 1: Clean Code căn bản
1. 5 mục tiêu chính của Clean Code là
   - MT1: Code hiệu quả, đơn giản, dễ hiểu
   - MT2: Mang lại hiệu quả cho công việc
   - MT3: Dễ hiểu khi đọc code
   - MT4: Dễ dàng bảo trì
   - MT5: Để tiết kiệm thời 
   
2. Chọn phương án C.
   - Việc không áp dụng clean code đương nhiên là không hợp lý, sau này sẽ mất rất nhiều thời gian fix bug, bảo trì code, các thành viên khó thống nhất với nhau
=> Loại trừ phương án A

- Việc dùng 30% để training clean code là quá nhiều. Ảnh hưởng đến thời gian cho phép của dự án, chưa kể clean code là kỹ năng phải mưa dầm thấm lâu.
Có học xong ngay cũng chưa thể áp dụng ngay một cách hiệu quả nhất.
=> Loại trừ phương án B

- Chọn phương án C, phương án cân bằng, tối ưu nhất và ít khuyết điểm nhất so với 2 phương án A và B.
   
3. Trường hợp NẾU em là team lead. Em sẽ trả lời với người đưa ra ý kiến như sau:
"Cả thế giới đều biết clean code mang lại hiệu quả như thế nào, nó tăng hiệu suất công việc, mang lại quy chuẩn thống nhất để các thành viên tuân theo.
Dễ dàng cho việc code, đọc code, fix bug, bảo trì.... Việc em/bạn (người đưa ra ý kiến) cho rằng clean code chỉ làm phức tạp vấn đề là thiển cận,
em/bạn cần training lại trước khi vào dự án."
   
4. Đề xuất của Vân là hợp lý. Ta nên tách riêng 1 phương thức tính số năm làm việc.
   
5. Mã nguồn:
   https://github.com/thaopm/CleanCodeHomework/tree/main/Phan%201/PostManagement

## Phần 2: OOP và SOLID
### 1. Hãy lập trình Java để thực hiện thiết kế như hình vẽ
   Mã nguồn:


### 2. Composition over Inheritance và DI
// Bỏ qua


## Phần 3: Thiết kế CSDL Quan hệ theo đặc tả
- Quan hệ giữa user và teacher: quan hệ 1 - 1
- Quan hệ giữa user và student: quan hệ 1 - 1
- Quan hệ giữa course và teacher: quan hệ n - 1
- Quan hệ giữa course và student: quan hệ n - n
https://github.com/chinhnd7/finish-exam/blob/master/Exam3.PNG

## Phần 4: Thiết kế RESTful API
   Link đến mã nguồn:
https://github.com/chinhnd7/finish-exam/tree/master/P4/CourseAPI

## Phần 5: Lập trình Restful API
   Link đến mã nguồn:
https://github.com/chinhnd7/finish-exam/tree/master/P5/CourseAPI

## Trắc nghiệm
1. Điều nào không đúng khi nói về Design Pattern?
=> C. Đã được thiết kế và cài đặt ở mức chi tiết.
2. Các OOP Design Pattern được chia làm mấy nhóm?
=> B.3
3. Các design pattern của nhóm Behavioral pattern có đặc điểm nào dưới đây?
=> A. Quan tâm đến cách các lớp và các đối tượng được tổ chức để trở thành một cấu trúc lớn hơn.
=> B. Cung cấp các cơ chế khởi tạo đối tượng khác nhau, làm tăng tính linh hoạt và tái sử dụng code.
=> D. Quan tâm đến cách giao tiếp giữa các lớp và các đối tượng.
4. Trong trường hợp client muốn khởi tạo một đối tượng mà không cần quan tâm logic khởi tạo đối tượng hoặc không biết rõ lớp của đối tượng thì chúng ta nên áp dụng design pattern nào đã được học?
=> C. Factory Method
5. Cách cài đặt Bill Pugh của Singleton pattern có đảm bảo thread-safe hay không?
=> A. Có
6. Đối tượng được khởi tạo bằng Builder pattern có điểm gì khác biệt so với đối tượng được khởi tạo bằng cách thông thường (thông qua toán tử new, rồi sau đó set các giá trị thông qua setter method)?
=> B. Immutable
7. Khi sử dụng annotation @Builder của Lombok thì đối tượng được khởi tạo có đảm bảo immutable hay không?
=> A. Không
8. Trong design pattern Flyweight, chúng ta lưu trữ loại dữ liệu nào trong bộ nhớ cache (flyweight factory)?
=> A. Dữ liệu không thay đổi theo context
9. Nếu có nhiều class chứa các thuật toán gần như giống hệt nhau và chỉ có một số ít khác biệt, thì chúng ta sẽ áp dụng design pattern nào đã được học để tránh bị lặp lại code, cũng như tốn ít công sức sửa code nếu có yêu cầu phải thay đổi tất cả các thuật toán?
=> B. Template Method
10. Một tác vụ có nhiều thuật toán để xử lý. Để dễ dàng chuyển đổi thuật toán tại thời điểm chạy chương trình tùy theo request từ phía client, chúng ta sẽ áp dụng design pattern nào đã được học?.
=> A. Strategy
11. REST là gì?
=> B. Kiểu kiến trúc phần mềm
12. Đâu không phải là đặc điểm của một hệ thống RESTful?
=> C. Server lưu trữ session và history của client.
13. Khi RESTful API có nhiệm vụ thêm mới một resource, chúng ta nên sử dụng HTTP method nào?
=> B. POST
14. HTTP method nào không đảm bảo idempotent trong tất cả các trường hợp?
=> B. POST
15. Chúng ta nên sử dụng query parameter cho những trường hợp nào?
=> D. Cả 3 đáp án trên
16. Các interface/class có nhiệm vụ thao tác với cơ sở dữ liệu được đặt ở layer nào?
=> B. Repository
17. Các bạn đã được tìm hiểu mấy phương pháp đánh version cho RESTful API trong khóa học?
=> D. 4
18. Trong Spring Framework, phương pháp xử lý lỗi nào dưới đây cho phép chúng ta xử lý lỗi ở mức toàn ứng dụng (global)?
=> A. Sử dụng @ControllerAdvice và @ExceptionHandler
19. Để thông báo cho người quản trị hệ thống biết một chức năng đã gặp lỗi, chúng ta nên sử dụng log level nào?
=> C. ERROR
20. Để cảnh báo việc tiến trình có thể không chạy đúng với logic, nhưng ứng dụng vẫn có thể tiếp tục, chúng ta nên sử dụng log level nào?
=> B. WARN
21. Có phải method được đánh dấu annotation @Cacheable luôn được thực thi mỗi khi RESTful API được gọi?
=> B. Không
22. Anti-pattern Jaywalking phù hợp trong trường hợp nào?
=> C. A và B.
23. Đâu không phải là giải pháp phù hợp để thay thế cho anti-pattern Multi-column Attributes? Giả sử tôi cần lưu các tag của một article.
=> B. Lưu giá trị của các tag vào N cột trong bảng article.
24. Nếu sử dụng anti-pattern Entity-Value-Attribute, giả sử đối tượng có 5 thuộc tính, vậy tôi cần thực hiện tất cả bao nhiêu phép JOIN để lấy đủ thông tin của 5 thuộc tính?
=> C. 5
25. Tree model nào không dễ để query child node ngay dưới?
=> C. Nested Set
