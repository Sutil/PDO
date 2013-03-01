package br.com.pdo.ste.config.root.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Profile;

@Profile("morena_rosa")
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Producao {

}