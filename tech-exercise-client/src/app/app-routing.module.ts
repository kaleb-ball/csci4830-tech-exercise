import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddWorkoutComponent } from './add-workout/add-workout.component';
import { TodayComponent } from './today/today.component';

const routes: Routes = [
  {path:'today', component: TodayComponent},
  {path:'add', component:AddWorkoutComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
