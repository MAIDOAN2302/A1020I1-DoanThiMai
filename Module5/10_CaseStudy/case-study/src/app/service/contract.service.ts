import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ContractService {
  public API: string = ' http://localhost:3000/contract';

  constructor(
    private http: HttpClient
  ) { }
  getAllContracts(): Observable<any>{
    return this.http.get(this.API);
  }

  // @ts-ignore
  addNewContract(contract): Observable<any>{
    return this.http.post(this.API,contract);
  }

  // @ts-ignore
  getContractById(contractID):Observable<any>{
    return this.http.get(this.API + '/' + contractID);
  }

  // @ts-ignore
  deleteContractByID(contractID): Observable<any>{
    return this.http.delete(this.API + '/' + contractID);
  }

  // @ts-ignore
  editContract(contract,contractID): Observable<any>{
    return this.http.put(this.API + '/' + contractID, contract);
  }
}
