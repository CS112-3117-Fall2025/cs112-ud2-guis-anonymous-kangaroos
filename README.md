[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=21238319)
# Unit Deliverable 2 - Final Project GUI
<br><br>
This project is a budgeting app. The application uses Javafx to allow the user to upload files with their financial information. The driver then parses that data and displays the user's finances to the GUI. The user's spending is grouped into categories for users to track their spending habits. The 3 graph types are parsed into 3 distinct classes: PieChart, BarGraph, and LineGraph. Each class is derived from the abstract parent class Chart. Legend class is bare bones but functional. It was included to not throw errors when BarGraph and PieChart classes are tested because both use Legend instance variables.

<br><br>

## Group Members
<br><br>
Isabella Watson, Nick Henao, Asan
<br><br>

## Project Requirements
<br><br>
<b>Wireframe Design:</b> png image included in GitHub repo Main branch ("UD2Wireframe.drawio.png")
<br><br>

<b> Java GUI in IntelliJ:</b> 4x .png screenshots included in GitHub repo Main branch. Also zipped up IntelliJ project and included in GitHub Repo: BudgetingApp.zip
<br><br>

<b>Integrate your model class from UD1 into the GUI project for at least one feature:</b> Integrated the abstract class "Chart" and derived class "PieChart" to manage budget data uploaded by the user. The GUI allows the user to upload a .txt file of their spending and the program parses the data into category, amount spent, and date. It then feeds the category array and amount spent array into a PieChart object to manipulate the data and print it back to the user.
<br><br>
<b>Included:</b> 4 concrete classes (PieChart, LineGraph, BarGraph, Legend), 3 tester clases (PieChartTester, LineGraphTester, BarGraphTester), 1 abstract class (Graph), inheritance/polymorphism, custom exception class (MismatchedDataLengthException)
<br><br>


## Wireframe
<br><br>
![alt text](UD2Wireframe.drawio.png?raw=true)

<br><br>

## GUI Screenshots
<br><br>
1. Application upon program launch 
<br>
![alt text](GUI_screenshot1.png?raw=true)
<br><br>
2. File explorer launched after user presses button
<br>
![alt text](GUI_screenshot2.png?raw=true)
<br><br>
3. User selects .txt file with budget information
<br>
![alt text](GUI_screenshot3.png?raw=true)
<br><br>
4. Program parses data from .txt file and creates 2 arrays: double spending[] and String categories[]. It then feeds these 2 arrays to the PieChart class which tabulates spending by category to display back to user on the GUI.
<br>
![alt text](GUI_screenshot4.png?raw=true)
<br><br>


