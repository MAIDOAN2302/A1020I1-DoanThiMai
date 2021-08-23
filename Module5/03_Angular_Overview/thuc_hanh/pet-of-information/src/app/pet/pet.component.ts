import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pet',
  templateUrl: './pet.component.html',
  styleUrls: ['./pet.component.css']
})
export class PetComponent implements OnInit {
  petName = 'puppie';
  petImage = 'https://c1.staticflickr.com/7/6045/6364998507_1e628cb1c5_b.jpg'

  constructor() { }
updateName(name:string){
    this.petName = name;
}
updateImage(image:any){
    this.petImage = image;
}
  ngOnInit(): void {
  }

}
