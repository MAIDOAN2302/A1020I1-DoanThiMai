import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-color-picker',
  templateUrl: './color-picker.component.html',
  styleUrls: ['./color-picker.component.css']
})
export class ColorPickerComponent implements OnInit {
  background  = 'blue';

  constructor() { }

  changeColor(value:any){
    this.background = value;
  }
  ngOnInit(): void {
  }

}
