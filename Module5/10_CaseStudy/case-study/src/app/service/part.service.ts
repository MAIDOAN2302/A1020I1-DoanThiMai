import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {IPart} from "../models/part";

@Injectable({
  providedIn: 'root'
})
export class PartService {
  public API: string = 'http://localhost:3000/part';


  constructor(private http: HttpClient) {
  }

  getAllPart(): Observable<IPart[]> {
    return this.http.get<IPart[]>(this.API)
  }
}
