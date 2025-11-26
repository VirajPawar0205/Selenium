Feature:Test
Scenario:
Given Open url="https://ciitstudent.com/"
Given Employee Login Button
Given Employee Email="roshan@gmail.com"
Given Employee Password="P0wersh@t"
Given Click on Login
Given go to Student 
Given go to view Details 
When Email is="yuvraj.gadadare@gmail.com"
Then close the window 