Feature: Search by image in Google
i searh image using the camera option and upload and image


Scenario: Search by image in Google
Given The user is in the main Google
When make click on the icon camera
And load an image from my computer
Then search should show result base on my image loaded