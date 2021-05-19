def scope_test():

    def do_local():
        spam = "local spam (changed in do_local)"

    def do_nonlocal():
        nonlocal spam
        spam = "non local spam (changed in do_nonlocal)"

    def do_global():
        global spam
        spam = "global spam (changed in do_global)"

    def do_global_2():
        global spam
        spam += " changed in do_global_2"
    #def 
    spam = "scope_test spam (changed in scope_test)"
    
    print(f"spam in scope_test: {spam}")
    do_local()
    print(f"spam after do_local: {spam}")

    do_nonlocal()
    print(f"spam after do_nonlocal: {spam}")

    do_global()
    print(f"spam after do_global: {spam}")

    do_global_2()
    print(f"spam after do_global_2: {spam}")

#end def

spam = "Global Spam"
print(f"spam in module: {spam}")
scope_test()
print(f"Spam after sope_test: {spam}")
