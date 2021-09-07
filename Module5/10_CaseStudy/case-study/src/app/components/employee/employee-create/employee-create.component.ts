import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {EmployeeService} from "../../../service/employee.service";
import {Router} from "@angular/router";
import {DatePipe} from "@angular/common";

@Component({
  selector: 'app-employee-create',
  templateUrl: './employee-create.component.html',
  styleUrls: ['./employee-create.component.css']
})
export class EmployeeCreateComponent implements OnInit {
// @ts-ignore
  public formCreateNewEmployee: FormGroup;
  public maxDate = new Date(2003,11,31);
  public minDate = new Date(1900,0,1);

  constructor(public formBuilder: FormBuilder,
              public employeeService: EmployeeService,
              public router: Router) { }

  ngOnInit(){
    this.formCreateNewEmployee = this.formBuilder.group({
      id: ['',[Validators.required]],
      fullName: ['',[Validators.required]],
      position: ['',[Validators.required]],
      educationDegree:['',[Validators.required]],
      part:['',[Validators.required]],
      dateOfBirth:['',[Validators.required]],
      idCard:['',[Validators.required,Validators.pattern('^[\\d]{9}$')]],
      salary:['',[Validators.required,Validators.pattern('^[\\d]*$')]],
      email:['',[Validators.required,Validators.email]],
      phone:['',[Validators.required,Validators.pattern(
        '^(090|091|([\(]84[\)][\+]90)|([\(]84[\)][\+]91))[0-9]{7}$')]],
      address:['',[Validators.required]],
    })
  }

  createNewEmployee() {
    this.employeeService.addNewEmployee(this.formCreateNewEmployee.value).subscribe(data =>{
      this.router.navigateByUrl('employee-list');
    })
  }
}
