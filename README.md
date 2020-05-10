# spring-cloud-distributed-tracing
Distributed tracing with spring cloud Sleuth and Zipkin
- Spring cloud sleuth generates Span Id and Trace Id
- Spring cloud zipkin monitors and manages sleuth logs of the application
- AlwaysSampler bean is used to export the logs into zipkin server
