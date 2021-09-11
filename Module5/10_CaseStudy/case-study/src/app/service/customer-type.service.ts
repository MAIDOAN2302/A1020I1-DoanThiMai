import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {ICustomerType} from "../models/customerType";

@Injectable({
  providedIn: 'root'
})
export class CustomerTypeService {
  public API: string = ' http://localhost:3000/customerTypes';


  constructor(private http: HttpClient) {
  }
  getAllCustomerType(): Observable<ICustomerType[]> {
    return this.http.get<ICustomerType[]>(this.API)
  }
}
