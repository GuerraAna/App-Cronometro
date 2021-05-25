## Aplicativo Cronômetro:

- nível: básico;
- Linguagem: Kotlin;
- Ambiente: Android Studio.


## Design do layout:

- Cronômetro (1x);
- Button iniciar ;
- Button Pausar;
- Button Zerar.


## Passo a passo e dica:

1. Desenvolver no layout: activity_main.xml
Criar as cores: values > colors;
Ir ao Layout: activity_main.xml;
Criar os Widgets: Chronometer e button's.


2. Desenvolver a parte lógica: MainActivity.kt
a) Recuperar os id's dos componentes com viewBingind;
No gradle Module > android
Adicionar: buildFeatures {
				viewBinding true
			}
			     
b) Na MainActivity:
private lateinit var binding: ActivityMainBinding;
var running: Boolean = false
pause: Long = 0

c) No onCreate, para usar o Binding:
binding = ActivityMainBinding.inflate(layoutInflater)
setContentVier(binding.root)

d) No onCreate, para iniciar as interações:
Criar método de iniciar a contagem;
Criar método de pausar a contagem;
Criar método de zerar a contagem.
