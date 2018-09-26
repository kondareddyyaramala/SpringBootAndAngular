import { Component, HostListener } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {


  @HostListener('document:click', ['$event'])
  onDocumentClick($event) {
    // listens to the click event on document
  }

}
