import cv2
import numpy as np

# Load the soccer ball image
img = cv2.imread('soccer.png')
cv2_imshow( img)
# Convert the image to grayscale
gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)

# Reduce noise using a bilateral filter
gray = cv2.bilateralFilter(gray, 9, 75, 75)

# Detect edges using the Canny edge detection algorithm
edges = cv2.Canny(gray, 5, 200)

kernel = np.ones((2,2), np.uint8)  
img_dilation = cv2.dilate(edges, kernel, iterations=1) 

cv2_imshow(img_dilation)

ret, thresh = cv2.threshold(img_dilation, 0, 255, cv2.THRESH_BINARY_INV)

# Convert the black patches to blue
blue = np.zeros_like(img)
blue[thresh == 255] = (255, 0, 0)

# Convert the white patches to red
red = np.zeros_like(img)
red[thresh == 0] = (0, 0, 255)

# Display the original and the colorized images side by side

cv2_imshow( cv2.add(red, blue))
cv2.waitKey(0)
cv2.destroyAllWindows()
