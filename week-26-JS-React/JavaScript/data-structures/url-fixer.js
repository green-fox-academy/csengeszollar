'use strict';
// Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
// Also, the URL is missing a crucial component, find out what it is and insert it too!

let url= 'https//www.reddit.com/r/nevertellmethebots';
let indexOfInsert = url.indexOf("//www");
let insertColon = ":";
// url = url.slice(0,indexOfInsert) + insertColon + url.slice(indexOfInsert, url.length-4) + "odds";

url = url.substring(0, indexOfInsert) + insertColon + url.substring(indexOfInsert, url.length-4) + "odds";
console.log(url);