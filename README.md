## Solution Process

### Task 1
**Setup the environment**

This part was easy, the most trick part was to find how I change my Java version (I never needed to do it before) but with literally two minutes of search I find out there is a command to do it.

### Task 2
**Create the DOMAIN class**

At first I thought of transforming **segment** also in a domain with a relationship of **many-to-one** with company. After all many companies can have the same segment, it's more easy to add others atributes to segment in the future, like a description or something like that. Also queries and filter will be more efficient.

But in the end I decided to keep it simple, after all I will only add three companies.

After deciding how my company domain will look like I create the **domain**, **service** and **controller**.

### Task 3
**Get the companies in the frontend**

I created a angular component and a service, in the component html of this component I add a **button**, an **input** and a **table**. In the **service** I created a method that calls the backend API to get the companies.

**HTML file**:
The button just call a method named handleClick that is implemented in the logic file of the component.
In the input I used the Angular directive `ngModule` so every change in the input is automatically reflected in the data model.
In the table I use the Angular directive `ngFor` to dynamically construct the table based on the companies list.

**Logic file**:
In the logic file I implemented to methods: **handleClick** and **filterCompanies**.
The **handleClick** just call the company service in the frontend and put the **json** that it returns in the component attribute **companies**.
The **filterCompanies** just filter the companies based on the input that is on the HTML.

**Style file**:
I put just a simple style.

### Task 4
**Filter the companies and segments**

In the HTML when I use the directive `ngFor` to construct the table dynamically I used it with the method **filterComponet** to filter the companies and segments if the input has any text.

### Task 5 ?
**Integration test**

Inside **frontend/cypress/integration** I find a file named **unique_test** saying that it is another test to write a simple integration test. So I did it.

### OBS

I was having a **Cross-Origin Resource Sharing** (CORS) error, I search and find out that it is a security mesure implemented by the browsers to prevent request for a domain different of which the page was loaded. I never had this problem before, so I don't know if it was a thing that I did wrong or if it was just a simple problem that I have to solve.

I don't know if I solve it the right way, but to solve it I add the code bellow in the **backend/grails-app/conf/application.yml** file.
```
cors:

	enabled: true
	
	allowOrigin: "http://localhost:8080"
	
	allowMethods: "GET"
	
	allowHeaders: "*"
```

This was the easiest way to solve it (I don't know if is the best).

---
## How to run
Inside the grails project directory (/backend), run:
```
grails run-app
```
to check if the things are ok.  
In the angular project directory (/frontend), run:
```
npm i
```
to finish your setup, then execute
```
ng serve
```
to see the project running.