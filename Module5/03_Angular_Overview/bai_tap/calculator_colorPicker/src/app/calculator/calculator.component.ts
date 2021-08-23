import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  number1 = 0;
  number2 = 0;
  operator = '+';
  result = 0;

  calculate(){
    this.result = eval(this.number1 + this.operator + this.number2)
    //Hàm eval() trong Javascript
    // Phương thức eval() có chức năng tính toán biểu thức toán học hoặc thức thi mã lệnh tùy thuộc vào tham số
    // mà người dùng truyền vào khi khởi tạo phương thức.
    // Nếu tham số truyền vào là một biểu thức toán học, phương thức sẽ tính toàn và trả về kết quả của biểu thức đó.
    }

  ngOnInit(): void {
  }
}