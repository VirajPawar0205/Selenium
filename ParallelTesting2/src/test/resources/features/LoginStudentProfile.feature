@overall
Feature:test
Scenario:
Given Open st Login url="https://ciitstudent.com/"
Given Enter st Student Email="yuvraj.gadadare@gmail.com"
Given Enter st Student Password="pp"
When Click st Login button 
Then Check st correct Login is="Yuvraj Gadadare"
Given close the driver