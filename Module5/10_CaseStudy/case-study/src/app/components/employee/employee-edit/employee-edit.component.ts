import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {EmployeeService} from "../../../service/employee.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-employee-edit',
  templateUrl: './employee-edit.component.html',
  styleUrls: ['./employee-edit.component.css']
})
export class EmployeeEditComponent implements OnInit {
// @ts-ignore
  public formEditEmployee: FormGroup;
  public maxDate = new Date(2003,11,31);
  public minDate = new Date(1900,0,1);
  // @ts-ignore
  public employeeOfId;
  constructor(public formBuilder: FormBuilder,
              public employeeService: EmployeeService,
              public router: Router,
              public activatedRouter: ActivatedRoute) { }

  ngOnInit(){
    this.formEditEmployee = this.formBuilder.group({
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
    });
    this.activatedRouter.params.subscribe(data =>{
      this.employeeOfId = data.id;
      this.employeeService.getEmployeeById(this.employeeOfId).subscribe(data =>{
        this.formEditEmployee.patchValue(data);
      })
    })
  }
  editEmployee() {
    this.employeeService.editEmployee(this.formEditEmployee.value, this.employeeOfId).subscribe(data=>{
      this.router.navigateByUrl('employee-list');
    })
  }
}
