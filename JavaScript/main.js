console.log("Community Portal Loaded");

const events = [

{
name:"Music Festival",
category:"music",
image:"https://images.unsplash.com/photo-1493225457124-a3eb161ffa5f"
},

{
name:"Football Match",
category:"sports",
image:"https://images.unsplash.com/photo-1574629810360-7efbbe195018"
},

{
name:"Coding Workshop",
category:"workshop",
image:"https://images.unsplash.com/photo-1516321318423-f06f85e504b3"
}

];

const container =
document.getElementById("eventContainer");

function displayEvents(list){

container.innerHTML="";

list.forEach(event=>{

container.innerHTML += `
<div class="event-card">

<img src="${event.image}">

<div class="event-card-content">

<h3>${event.name}</h3>

<p>Join our exciting ${event.category} event.</p>

<button onclick="registerEvent('${event.name}')">
Register
</button>

</div>

</div>
`;

});

}

displayEvents(events);

function filterEvents(){

const category =
document.getElementById("categoryFilter").value;

if(category==="all"){
displayEvents(events);
}
else{
displayEvents(
events.filter(
e=>e.category===category
)
);
}

}

function registerEvent(name){

alert(
"You registered for " + name
);

}

document
.getElementById("registrationForm")
.addEventListener("submit",

function(e){

e.preventDefault();

document.getElementById("successMsg")
.innerHTML =
"Registration Successful ✓";

});

function findLocation(){

if(navigator.geolocation){

navigator.geolocation.getCurrentPosition(

function(position){

document.getElementById("locationResult")
.innerHTML =
`Latitude:
${position.coords.latitude}
<br>
Longitude:
${position.coords.longitude}`;

}

);

}

}

function scrollToEvents(){

document
.getElementById("events")
.scrollIntoView({
behavior:"smooth"
});

}