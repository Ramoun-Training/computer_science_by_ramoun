import { render, screen, waitFor } from '@testing-library/react';
import user from '@testing-library/user-event';
import App from './App';

test('show 6 products on initial load', async () => {
    // Arrange
    render(<App />);

    // Act
    const headings = await screen.findAllByRole('heading');

    // Assert
    expect(headings).toHaveLength(6)
});

test('on clicking "load more" button, the number of products should increase', async () => {
    // Arrange
    render(<App />);

    // Act
    const button = await screen.findByRole('button', {
        name: /load more/i
    });
    await user.click(button);

    // Assert
    await waitFor(async () => {
        const headings = await screen.findAllByRole('heading');
        expect(headings).toHaveLength(12);
    });
});