let images = [
    "https://static.toiimg.com/photo/imgsize-161580,msid-96352420/96352420.jpg",
    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR7gIX8ehY2jjN5YsG5XOw_ID093k7g5cQYkw&s",
    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQp_O07XL8lLQyQ-MGCV3TJ8VKVEfMFBUUu9Q&s"
];
let Index = 0;

function showImage() {
    document.getElementById("galleryImage").src = images[Index];
}

function nextImage() {
    Index = (Index + 1) % images.length;
    showImage();
}

function prevImage() {
    Index = (Index - 1 + images.length) % images.length;
    showImage();
}

showImage();