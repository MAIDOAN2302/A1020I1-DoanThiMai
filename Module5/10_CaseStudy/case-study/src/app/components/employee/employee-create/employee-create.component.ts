import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {EmployeeService} from "../../../service/employee.service";
import {Router} from "@angular/router";
import {IPosition} from "../../../models/position";
import {IPart} from "../../../models/part";
import {IEducationDegree} from "../../../models/educationDegree";
import {PartService} from "../../../service/part.service";
import {PositionService} from "../../../service/position.service";
import {EducationDegreeService} from "../../../service/education-degree.service";

@Component({
  selector: 'app-employee-create',
  templateUrl: './employee-create.component.html',
  styleUrls: ['./employee-create.component.css']
})
export class EmployeeCreateComponent implements OnInit {
// @ts-ignore
  public formCreateNewEmployee: FormGroup;
  // @ts-ignore
  public positions: IPosition[];
  // @ts-ignore
  public parts: IPart[];
  // @ts-ignore
  public educationDegrees: IEducationDegree[];

  public maxDate = new Date(2003,11,31);
  public minDate = new Date(1900,0,1);

  constructor(public formBuilder: FormBuilder,
              public employeeService: EmployeeService,
              public partService: PartService,
              public positionService: PositionService,
              public educationDegreeService: EducationDegreeService,
              public router: Router) { }

  ngOnInit(){
    this.positionService.getAllPosition().subscribe(data=>{
      this.positions = data;
    });
    this.educationDegreeService.getAllEducationDegree().subscribe(data=>{
      this.educationDegrees = data;
    });
    this.partService.getAllPart().subscribe(data=>{
      this.parts = data;
    });
    this.formCreateNewEmployee = this.formBuilder.group({
      idEmployee: ['',[Validators.required,Validators.pattern(/^NV-\d{4}$/)]],
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
      address:['',[Validators.required]]
    });
  };
  createNewEmployee() {
    this.employeeService.addNewEmployee(this.formCreateNewEmployee.value).subscribe(
      data =>{
      this.router.navigateByUrl('employee-list');
    });
  };
}
