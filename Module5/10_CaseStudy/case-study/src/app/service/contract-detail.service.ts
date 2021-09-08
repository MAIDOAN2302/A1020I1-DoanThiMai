import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ContractDetailService {
  public API: string = ' http://localhost:3000/contractDetail';

  constructor(
    private http: HttpClient
  ) { }
  getAllContractDetails(): Observable<any>{
    return this.http.get(this.API);
  }

  // @ts-ignore
  addNewContractDetail(contractDetail): Observable<any>{
    return this.http.post(this.API,contractDetail);
  }

  // @ts-ignore
  getContractDetailById(contractDetailID):Observable<any>{
    return this.http.get(this.API + '/' + contractDetailID);
  }

  // @ts-ignore
  deleteContractDetailByID(contractDetailID): Observable<any>{
    return this.http.delete(this.API + '/' + contractDetailID);
  }

  // @ts-ignore
  editContractDetail(contractDetail,contractDetailID): Observable<any>{
    return this.http.put(this.API + '/' + contractDetailID, contractDetail);
  }
}
