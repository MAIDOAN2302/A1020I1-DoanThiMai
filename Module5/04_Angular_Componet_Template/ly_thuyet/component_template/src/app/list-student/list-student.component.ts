import { Component, OnInit } from '@angular/core';
export interface IStudent {
  id : number;
  name: string;
  age: number;
  mark: number;
  address:string;
  image: string;
}
@Component({
  selector: 'app-list-student',
  templateUrl: './list-student.component.html',
  styleUrls: ['./list-student.component.css']
})
export class ListStudentComponent implements OnInit {
  student: IStudent = {
    id: 1,
    name : 'Nguyen Van A',
    age: 23,
    mark: 10,
    address:'Quang Nam',
    image:'https://www.vexels.com/media/users/3/145908/raw/52eabf633ca6414e60a7677b0b917d92.jpg'
  };
  constructor() { }

  ngOnInit(): void {
  }

  getMark(value: any) {
    this.student.mark = value;
  }
}
