import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {EmployeeService} from "../../../service/employee.service";

@Component({
  selector: 'app-employee-delete',
  templateUrl: './employee-delete.component.html',
  styleUrls: ['./employee-delete.component.css']
})
export class EmployeeDeleteComponent implements OnInit {
  // @ts-ignore
  public deleteEmployeeName;
  // @ts-ignore
  public employeeOfID;
  constructor(
    public dialogRef: MatDialogRef<EmployeeDeleteComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public employeeService: EmployeeService) {}

  ngOnInit(){
    this.deleteEmployeeName = this.data.data1.fullName;
    this.employeeOfID = this.data.data1.id;
  }

  deleteEmployee() {
    this.employeeService.deleteEmployeeByID(this.employeeOfID).subscribe(data =>{
      this.dialogRef.close();
    });
  }
}
