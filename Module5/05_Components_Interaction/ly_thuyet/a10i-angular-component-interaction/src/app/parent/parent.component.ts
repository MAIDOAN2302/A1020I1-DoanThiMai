import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {

  valueSendToChild = 'Hello Child! (from Parent)';

  constructor() {

  }

  ngOnInit(): void {
  }

  receiveFromChild(value: any): void {
    console.log(value);
  }
}
