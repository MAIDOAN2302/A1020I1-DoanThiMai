import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {EmployeeService} from "../../../service/employee.service";
import {Router} from "@angular/router";
import {ContractService} from "../../../service/contract.service";

@Component({
  selector: 'app-contract-create',
  templateUrl: './contract-create.component.html',
  styleUrls: ['./contract-create.component.css']
})
export class ContractCreateComponent implements OnInit {

// @ts-ignore
  public formCreateNewContract: FormGroup;
  public maxDate = new Date(2003,11,31);
  public minDate = new Date(1900,0,1);

  constructor(public formBuilder: FormBuilder,
              public contractService: ContractService,
              public router: Router) { }

  ngOnInit(){
    this.formCreateNewContract = this.formBuilder.group({
      id: ['',[Validators.required]],
      idEmployee: ['',[Validators.required]],
      idCustomer: ['',[Validators.required]],
      idService:['',[Validators.required]],
      startDay:['',[Validators.required]],
      endDay:['',[Validators.required]],
      amount:['',[Validators.required]],
      total:['',[Validators.required]],
    })
  }

  createNewContract() {
    this.contractService.addNewContract(this.formCreateNewContract.value).subscribe(data =>{
      this.router.navigateByUrl('contract-list');
    })
  }

}
