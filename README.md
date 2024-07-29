# Producer Consumer Problem

## Introduction
The Producer-Consumer problem is a classic example of a multi-process synchronization problem. The problem describes two processes, the producer and the consumer, who share a common, fixed-size buffer used as a queue. The producer's job is to generate data, put it into the buffer, and start again. Simultaneously, the consumer's job is to consume the data from this buffer, one piece at a time.

This project implements the Producer-Consumer problem in Java, utilizing the `synchronized` keyword and inter-thread communication mechanisms to facilitate seamless data exchange and prevent race conditions.

## Features
- **Multi-threaded Execution:** Separate threads for producer and consumer.
- **Synchronized Methods:** Ensures that only one thread can access critical sections of code at a time.
- **Inter-thread Communication:** Utilizes `wait()` and `notify()` methods for efficient data exchange.

## Technologies Used
- **Java**

## Implementation Details
1. **Producer:** The producer thread generates data and puts it into the buffer.
2. **Consumer:** The consumer thread takes data from the buffer and processes it.
3. **Buffer:** A shared, fixed-size buffer that acts as the queue.
4. **Synchronization:** Ensures that only one thread accesses the buffer at a time to prevent data inconsistency.

### Code Structure
- **ProducerConsumer.java:** Main class that sets up and runs the producer and consumer threads.
- **Buffer.java:** Class that implements the buffer with synchronized methods for adding and removing data.
- **Producer.java:** Class that defines the producer thread.
- **Consumer.java:** Class that defines the consumer thread.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) installed on your machine.

### Running the Project
1. Clone the repository:
    ```sh
    git clone https://github.com/code-nd-coffee/Producer-Consumer-Problem.git
    ```
2. Navigate to the project directory:
    ```sh
    cd Producer-Consumer-Problem
    ```
3. Compile the Java files:
    ```sh
    javac *.java
    ```
4. Run the program:
    ```sh
    java ProducerConsumer
    ```

## Usage
- The producer generates random numbers and puts them into the buffer.
- The consumer retrieves these numbers from the buffer and prints them.

### Sample Output
Produced: 1 /n
Consumed: 1 /n
Produced: 2 /n
Consumed: 2 /n
Produced: 3 /n
Consumed: 3 /n
...



## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Author
**Shivam Kumar**
- [LinkedIn](https://www.linkedin.com/in/codencoffee)
- [GitHub](https://github.com/code-nd-coffee)


