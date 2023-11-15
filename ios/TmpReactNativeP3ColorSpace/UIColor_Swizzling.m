// UIColor_Swizzling.m
#import "UIColor_Swizzling.h"
#import <objc/runtime.h>

@implementation UIColor (Swizzling)

+ (void)swizzleColorMethods {
  SEL originalSelector = @selector(colorWithRed:green:blue:alpha:);
  SEL swizzledSelector = @selector(swizzled_colorWithRed:green:blue:alpha:);

  Method originalMethod = class_getClassMethod(self, originalSelector);
  Method swizzledMethod = class_getClassMethod(self, swizzledSelector);

  method_exchangeImplementations(originalMethod, swizzledMethod);
}

+ (UIColor *)swizzled_colorWithRed:(CGFloat)red
                             green:(CGFloat)green
                              blue:(CGFloat)blue
                             alpha:(CGFloat)alpha {
  return [UIColor colorWithDisplayP3Red:red green:green blue:blue alpha:alpha];
}

@end
