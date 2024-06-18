const robot = require("robotjs");
async function runRobot() {
  try {
    const issues = [
      {
        title: "Setup MySQL Database Connection",
        description:
          "Implement database configuration to connect Spring Boot application to MySQL database.",
      },
      {
        title: "Define Entity Classes",
        description:
          "Define JPA entity classes to model data entities for CRUD operations.",
      },
      {
        title: "Implement CRUD Repositories",
        description:
          "Set up Spring Data JPA repositories for basic CRUD operations.",
      },
      {
        title: "Test Database Operations",
        description: "Verify CRUD operations and database interactions.",
      },
      {
        title: "Create REST Endpoints",
        description: "Develop RESTful endpoints to expose CRUD operations.",
      },
      {
        title: "Request Validation",
        description:
          "Implement validation for request payloads to ensure data integrity.",
      },
      {
        title: "Exception Handling",
        description:
          "Implement global exception handling to provide consistent error responses.",
      },
      {
        title: "Secure Endpoints",
        description:
          "Secure REST endpoints based on role-based access control.",
      },
      {
        title: "Testing APIs",
        description:
          "Write unit and integration tests for REST controllers and API endpoints.",
      },
      {
        title: "API Documentation",
        description:
          "Document REST APIs to provide usage instructions and examples.",
      },
      {
        title: "Versioning and Best Practices",
        description:
          "Implement API versioning and adhere to RESTful best practices.",
      },
    ];

    // Function to simulate typing and pressing Enter
    function typeAndPressEnter(title, description) {
      return new Promise((resolve, reject) => {
        setTimeout(() => {
          robot.keyToggle("control", "down");
          robot.keyTap("space");
          robot.keyToggle("control", "up");

          setTimeout(() => {
            robot.typeString(`${title} ${description}`);
            robot.keyTap("enter");
            resolve();
          }, 500); // Adjust the delay (in milliseconds) between typing and pressing Enter
        }, 500); // Adjust the delay (in milliseconds) before typing starts
      });
    }

    // Loop through each issue and simulate typing and pressing Enter
    for (let i = 0; i < issues.length; i++) {
      const { title, description } = issues[i];
      await typeAndPressEnter(title, description);
      await new Promise(resolve => setTimeout(resolve, 300)); // Adjust delay between issues (in milliseconds)
    }

  } catch (error) {
    console.error("Error:", error);
  }
}

runRobot();
