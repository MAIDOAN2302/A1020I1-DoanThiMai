import { Component, OnInit } from '@angular/core';
import {EmployeeService} from "../../../service/employee.service";
import {MatDialog} from "@angular/material/dialog";
import {EmployeeDeleteComponent} from "../employee-delete/employee-delete.component";
import {IEmployee} from "../../../models/employee";

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  // @ts-ignore
  public employees: IEmployee[];
  term: any;
  p: any;
  // @ts-ignore
  nameSearch='';

  constructor(
    public employeeService: EmployeeService,
    public dialog: MatDialog
  ) { }

  ngOnInit(){
    this.employeeService.getAllEmployees().subscribe(data =>{
      this.employees = data;
      // console.log(this.employees);
    })
  }

  // @ts-ignore
  openDialog(employeeID):void {
    this.employeeService.getEmployeeById(employeeID).subscribe(dataOfEmployee=>{
      const dialogRef = this.dialog.open(EmployeeDeleteComponent, {
        width: '500px',
        data: {data1: dataOfEmployee},
        disableClose: true
      });
      dialogRef.afterClosed().subscribe(result => {
        this.ngOnInit();
      });
    });
  };
  search() {
    this.employeeService.search(this.nameSearch).subscribe(data=>{
      // @ts-ignore
      this.employees =data
    })
  }
}
