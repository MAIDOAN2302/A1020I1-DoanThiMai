import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {ICustomer} from "./model/customer";

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  private API_URL = 'http://localhost:3000/customerList';
  message! : String;

  constructor(private httpClient : HttpClient) {
    console.log('service constructor');
  }
  findAll(): Observable<ICustomer[]>{
    return this.httpClient.get<ICustomer[]>(this.API_URL);
  }
  save(customer:ICustomer): Observable<void>{
    return  this.httpClient.post<void>(this.API_URL, customer)
  }
}
