# spring primary
@Primary

# spring profiles 
@Profile  
@Profile({"en", "default"})

# Spring call back events
Spring has two interfaces you can implement for   
    1. InitializingBean.afterPropertiesSet()
    2. DisposableBean.destroy()

# Bean post processor
    1. postProcessBeforeInitialization
    2. postProcessAfterInitialization