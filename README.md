# Student Analyzer - JUnit Practice

## 🔍 Mô tả bài toán

Viết chương trình Java có 2 hàm:

- `countExcellentStudents(List<Double>)`: đếm số học sinh có điểm >= 8.0
- `calculateValidAverage(List<Double>)`: tính trung bình điểm hợp lệ (0–10)

## ✅ Yêu cầu kiểm thử

- Danh sách rỗng
- Danh sách toàn điểm sai
- Danh sách lẫn điểm hợp lệ và sai
- Giá trị biên: 0, 10

## ▶️ Cách chạy chương trình

Build và chạy test:
```bash
./gradlew test
```
hoặc nếu dùng Maven:
```bash
mvn test
```
## Cách đo độ bao phủ mã kiểm thử
Công cụ sử dụng: IntelliJ IDEA có sẵn công cụ đo Code Coverage.

#### Các bước thực hiện:

Nhấn chuột phải vào file test StudentAnalyzerTest.java.

Chọn Run 'StudentAnalyzerTest' with Coverage.

Xem báo cáo ở tab Coverage.

## Kết quả đo độ bao phủ
Statement Coverage: 100%
Branch Coverage: 100%
✅ Mã kiểm thử đơn vị hoàn thiện và có độ bao phủ toàn diện.