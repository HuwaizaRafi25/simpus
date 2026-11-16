# --- Stage 1: Build pakai JDK 26 & Gradle Wrapper bawaan proyek ---
FROM openjdk:26-ea-jdk-slim AS builder
WORKDIR /app
COPY . .
RUN chmod +x ./gradlew && ./gradlew installDist --no-daemon

# --- Stage 2: Runtime pakai JDK 26 ---
FROM openjdk:26-ea-jdk-slim
WORKDIR /app
COPY --from=builder /app/build/install/simpus /app
ENTRYPOINT ["/app/bin/simpus"]