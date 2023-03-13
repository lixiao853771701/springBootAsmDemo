package com.xiaoli.demo;

import org.springframework.asm.ClassReader;

import java.io.InputStream;

/**
 * @author lixiao
 * @date 2023/3/10 15:52
 * @Description :
 */
public class Test {

    public static void main(String[] args) throws Exception {
        InputStream resourceAsStream = ClassLoader.getSystemClassLoader().getResourceAsStream("com/xiaoli/SpringBootAsmDemo.class");
        ClassReader classReader = new ClassReader(resourceAsStream);
        SimpleAnnotationMetadataReadingVisitor visitor = new SimpleAnnotationMetadataReadingVisitor(ClassLoader.getSystemClassLoader());
        classReader.accept(visitor, 2);
        System.out.println();
    }

}
