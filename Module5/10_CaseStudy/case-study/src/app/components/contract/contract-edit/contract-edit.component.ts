import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {ActivatedRoute, Router} from "@angular/router";
import {ContractService} from "../../../service/contract.service";

@Component({
  selector: 'app-contract-edit',
  templateUrl: './contract-edit.component.html',
  styleUrls: ['./contract-edit.component.css']
})
export class ContractEditComponent implements OnInit {

  // @ts-ignore
  public formEditContract: FormGroup;
  public maxDate = new Date(2003,11,31);
  public minDate = new Date(1900,0,1);
  // @ts-ignore
  public contractOfId;
  constructor(public formBuilder: FormBuilder,
              public contractService: ContractService,
              public router: Router,
              public activatedRouter: ActivatedRoute) { }

  ngOnInit(){
    this.formEditContract = this.formBuilder.group({
      id: ['',[Validators.required]],
      idEmployee: ['',[Validators.required]],
      idCustomer: ['',[Validators.required]],
      idService:['',[Validators.required]],
      startDay:['',[Validators.required]],
      endDay:['',[Validators.required]],
      amount:['',[Validators.required]],
      total:['',[Validators.required]],
    });
    this.activatedRouter.params.subscribe(data =>{
      this.contractOfId = data.id;
      this.contractService.getContractById(this.contractOfId).subscribe(data =>{
        this.formEditContract.patchValue(data);
      })
    })
  }
  editContract() {
    this.contractService.editContract(this.formEditContract.value, this.contractOfId).subscribe(
      data=>{
        this.router.navigateByUrl('contract-list');
    })
  }

}
