# Calculator App

A simple Java calculator built with Maven. The project includes unit and integration tests (TestNG), code-coverage enforcement (JaCoCo), and dependency vulnerability scanning (OWASP Dependency-Check).

> Based on the "Simple Java Calculator" by Tech with Jatin.

## Tech Stack

| Area | Tool / Version |
|------|----------------|
| Language | Java 11 |
| Build tool | Apache Maven |
| Testing | TestNG 7.12.0 |
| Utilities | Apache Commons IO 2.22.0 |
| Code coverage | JaCoCo 0.8.14 |
| Security scan | OWASP Dependency-Check 13.0.0 |
| Integration tests | Maven Failsafe 3.5.3 |
| Packaging | Maven JAR Plugin 3.4.2 |

## Project Structure

```
calculator-app/
├── src/
│   ├── main/java/        # Application source (calculator logic, com.runner.Runner entry point)
│   └── test/java/        # TestNG unit and integration tests
├── pom.xml               # Maven configuration
├── .gitignore
└── README.md
```

## Prerequisites

- JDK 11 or higher
- Apache Maven 3.6+

Verify your setup:

```bash
java -version
mvn -version
```

## Getting Started

```bash
# Clone the repository
git clone https://github.com/HeenaSk18/calculator-app.git
cd calculator-app

# Compile the project
mvn clean compile
```

## Build

```bash
mvn clean package
```

This produces `target/Calculator App.jar`, with `com.runner.Runner` configured as the main class.

## Run

```bash
java -jar "target/Calculator App.jar"
```

## Testing

Run unit tests:

```bash
mvn test
```

Run unit and integration tests together:

```bash
mvn verify
```

The Surefire plugin passes a system property `data=firefox` to the tests.

## Code Coverage (JaCoCo)

JaCoCo runs automatically during the build and generates reports for both unit and integration tests.

- Minimum coverage required: **60%** for complexity, branch, line and method coverage. The build fails if coverage drops below this.
- Excluded from coverage: `com/runner/**` and `com/demo/**`
- Reports are generated in `target/site/jacoco/`

## Security Scan (OWASP Dependency-Check)

The Dependency-Check plugin scans project dependencies for known vulnerabilities as part of the build.

```bash
mvn org.owasp:dependency-check-maven:check
```

- The build does not fail if the NVD database update fails (`failOnError` is `false`).
- For faster and more reliable updates, request a free key at https://nvd.nist.gov/developers/request-an-api-key and add it to the plugin configuration. **Never commit your API key to Git.**

## Useful Maven Commands

| Command | Purpose |
|---------|---------|
| `mvn clean` | Delete the `target/` directory |
| `mvn compile` | Compile source code |
| `mvn test` | Run unit tests |
| `mvn package` | Build the JAR |
| `mvn verify` | Run all tests and coverage checks |
| `mvn jacoco:report` | Generate the coverage report |

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/my-feature`)
3. Commit your changes (`git commit -m "Add my feature"`)
4. Push to the branch (`git push origin feature/my-feature`)
5. Open a Pull Request

## Author

**Heena** — [@HeenaSk18](https://github.com/HeenaSk18)

## License

No license has been specified yet. Add a `LICENSE` file (for example, MIT) if you want to make the project open source.
