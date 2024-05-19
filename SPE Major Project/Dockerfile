# Use an official node runtime as a parent image
FROM node:latest

# Set the working directory
WORKDIR /app

RUN cd ./SPE\ Major\ Project/

# Copy package.json and package-lock.json
COPY package*.json ./

# Install dependencies
RUN npm install

# Copy the rest of the application code
COPY . .

# Build the React app
RUN npm run build

# Use a smaller image to serve the built app
FROM nginx:alpine
COPY --from=0 /app/build /usr/share/nginx/html

# Expose the port the app runs on
EXPOSE 80

# Run nginx
CMD ["nginx", "-g", "daemon off;"]
