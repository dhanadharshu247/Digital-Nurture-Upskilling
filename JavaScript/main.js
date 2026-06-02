const events = [

{
title:"Music Festival",
category:"music",
description:"Live music performances from top artists."
},

{
title:"Football Match",
category:"sports",
description:"Inter-city football championship."
},

{
title:"Coding Workshop",
category:"workshop",
description:"Learn Web Development from experts."
}

];

const eventContainer =
document.getElementById("eventContainer");

function displayEvents(category="all"){

eventContainer.innerHTML="";

const filtered = category==="all"
? events
: events.filter(event =>
event.category===category);

filtered.forEach(event=>{

const card=document.createElement("div");

card.classList.add("event-card");

card.innerHTML=`
<h3>${event.title}</h3>
<p>${event.description}</p>
`;

card.addEventListener("click",()=>{

document.getElementById("modalTitle")
.innerHTML=event.title;

document.getElementById("modalDescription")
.innerHTML=event.description;

document.getElementById("eventModal")
.style.display="block";

});

eventContainer.appendChild(card);

});

}

displayEvents();

document
.getElementById("categoryFilter")
.addEventListener("change",(e)=>{

displayEvents(e.target.value);

});

document.querySelector(".close")
.addEventListener("click",()=>{

document.getElementById("eventModal")
.style.display="none";

});

function scrollToEvents(){

document
.getElementById("events")
.scrollIntoView({behavior:"smooth"});

}

function findLocation(){

if(navigator.geolocation){

navigator.geolocation.getCurrentPosition(position=>{

document.getElementById("locationResult")
.innerHTML=
`Latitude: ${position.coords.latitude}
<br>
Longitude: ${position.coords.longitude}`;

});

}

}

const eventDate =
new Date("December 31, 2026 18:00:00")
.getTime();

setInterval(()=>{

const now=new Date().getTime();

const distance=eventDate-now;

const days=Math.floor(
distance/(1000*60*60*24)
);

const hours=Math.floor(
(distance%(1000*60*60*24))
/
(1000*60*60)
);

const mins=Math.floor(
(distance%(1000*60*60))
/
(1000*60)
);

document.getElementById("timer")
.innerHTML=
`${days} Days ${hours} Hours ${mins} Minutes`;

},1000);