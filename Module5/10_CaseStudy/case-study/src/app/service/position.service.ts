import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {IPosition} from "../models/position";

@Injectable({
  providedIn: 'root'
})
export class PositionService {
  public API: string = ' http://localhost:3000/position';


  constructor(private http: HttpClient) {
  }

  getAllPosition(): Observable<IPosition[]> {
    return this.http.get<IPosition[]>(this.API)
  }
}
