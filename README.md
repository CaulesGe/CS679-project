# CS679-project
## Architecture

```text
CS679-project/
|-- fgsm_linear.ipynb
|-- README.md
`-- fgsm_cnn/
	|-- cnn.py
	|-- cnn_baseline.pt
	|-- training.ipynb
	|-- training.html
	|-- training.pdf
	`-- data/
		`-- MNIST/
			`-- raw/
				|-- train-images-idx3-ubyte
				|-- train-labels-idx1-ubyte
				|-- t10k-images-idx3-ubyte
				`-- t10k-labels-idx1-ubyte
```

## Where CNN Results Are

- Trained CNN baseline weights: `fgsm_cnn/cnn_baseline.pt`
- CNN experiment/report outputs: `fgsm_cnn/training.html` and `fgsm_cnn/training.pdf`
- Notebook used to produce CNN outputs: `fgsm_cnn/training.ipynb`
