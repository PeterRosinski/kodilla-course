package com.kodilla.orders;

public class OrderProcessor {

    private OrderService orderService;
    private InformationService informationService;
    private OrderRepository orderRepository;

    public OrderProcessor(final OrderService orderService, final InformationService informationService, final OrderRepository orderRepository) {
        this.orderService = orderService;
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getProduct(), orderRequest.getUser(), orderRequest.getPrice());
        if(isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.saveOrder(orderRequest.getProduct(),orderRequest.getUser(),orderRequest.getPrice());
            return new OrderDto(orderRequest.getProduct(),orderRequest.getUser(),true);
        } else {
            return new OrderDto(orderRequest.getProduct(),orderRequest.getUser(),false);
        }
    }
}
