import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from '../../environments/environment';

@Component({
  selector: 'app-today',
  templateUrl: './today.component.html',
  styleUrls: ['./today.component.scss']
})
export class TodayComponent implements OnInit {


  workouts : [];

  constructor(
    private http : HttpClient
  ) { }

  ngOnInit(): void {

    let todayTime = new Date();
    let month = todayTime.getMonth() + 1 
    let day = todayTime.getDate()
    let year = todayTime.getFullYear()
    let date = month + "-" + day + "-" + year;

    this.http.post(environment.apiUrl + '/api/workout/getWorkout', date).subscribe((data : any) => {
      this.workouts = data;
    });

  }

}
